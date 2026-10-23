package com.akurupela.sta.auth

import com.akurupela.sta.git.GitAuthFailure
import com.akurupela.sta.git.GitAuthProvider
import com.akurupela.sta.git.GitCredential
import com.akurupela.sta.git.GitSignIn
import com.intellij.openapi.components.Service

/**
 * [GitAuthProvider] for the IDE: sign-ins saved in the IDE password safe, and a sign-in dialog when a remote refuses.
 */
@Service(Service.Level.APP)
class GitAuthService : GitAuthProvider {
    override fun credentialsFor(servers: List<String>): List<GitCredential> {
        // TODO: implement (full source is private)
        return emptyList()
    }

    override fun signIn(failure: GitAuthFailure, previous: GitCredential?): GitSignIn? {
        // TODO: implement (full source is private)
        return null
    }
}
