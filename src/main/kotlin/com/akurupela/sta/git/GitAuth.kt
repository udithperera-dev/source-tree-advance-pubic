package com.akurupela.sta.git

/** How git signs in to a remote. Git's own credential helpers still run first. */
enum class GitAuthMethod(val label: String, val forHttp: Boolean, val forSsh: Boolean) {
    TOKEN("Access token", forHttp = true, forSsh = false),
    PASSWORD("Username and password", forHttp = true, forSsh = true),
    BEARER("Bearer token (Authorization header)", forHttp = true, forSsh = false),
    SSH_KEY("SSH key", forHttp = false, forSsh = true),
}

/** A sign-in for one server (`https://host`, `ssh://host`); [secret] is the password, token or key passphrase. */
class GitCredential(val key: String, val method: GitAuthMethod, val username: String = "", val secret: String = "", val keyPath: String = "") {
    override fun toString(): String = "GitCredential($key, $method)"
}

/** A git command the remote refused (HTTP sign-in, SSH sign-in, or an unknown SSH host key). */
data class GitAuthFailure(val kind: Kind, val server: String?, val message: String) {
    enum class Kind { HTTP, SSH, SSH_HOST_KEY }

    companion object {
        fun detect(stderr: String): GitAuthFailure? {
            // TODO: implement (full source is private)
            return null
        }
    }
}

sealed class GitSignIn {
    class Use(val credential: GitCredential) : GitSignIn()

    object TrustHostKey : GitSignIn()
}

/** Saved sign-ins and new ones; the IDE side implements it. */
interface GitAuthProvider {
    fun credentialsFor(servers: List<String>): List<GitCredential>

    /** null = cancelled. */
    fun signIn(failure: GitAuthFailure, previous: GitCredential?): GitSignIn?
}

object GitAuth {
    @Volatile
    var provider: GitAuthProvider? = null
}
