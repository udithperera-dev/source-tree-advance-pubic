package com.akurupela.sta.git

import com.intellij.openapi.progress.ProgressIndicator
import java.nio.file.Path

/** Read and write operations behind the tool window. Blocking: call off the EDT. */
class GitRepository(val root: Path) {
    enum class Scope(val label: String) { LOCAL("Local branches"), ALL("All branches"), CURRENT("Current branch") }

    enum class PullMode(val label: String) { MERGE("Merge"), REBASE("Rebase"), FF_ONLY("Fast-forward only") }

    /** `--author`, `--signoff`, `--gpg-sign`, `--no-verify`. */
    data class CommitOptions(val author: String = "", val signOff: Boolean = false, val sign: Boolean = false, val runHooks: Boolean = true)

    fun log(skip: Int, limit: Int, scope: Scope, authorEmail: String? = null): List<GitCommit> {
        // TODO: implement (full source is private)
        return emptyList()
    }

    fun status(): GitWorkingStatus {
        // TODO: implement (full source is private)
        return GitWorkingStatus(null, emptyList(), emptyList(), emptyList())
    }

    fun branches(): List<GitBranch> {
        // TODO: implement (full source is private)
        return emptyList()
    }

    fun stage(paths: List<String>) {
        // TODO: implement (full source is private)
    }

    fun unstage(paths: List<String>) {
        // TODO: implement (full source is private)
    }

    fun commit(message: String, amend: Boolean, options: CommitOptions = CommitOptions()) {
        // TODO: implement (full source is private)
    }

    fun fetch(indicator: ProgressIndicator?) {
        // TODO: implement (full source is private)
    }

    fun pull(mode: PullMode, indicator: ProgressIndicator?) {
        // TODO: implement (full source is private)
    }

    fun push(remote: String, branches: List<String>, forceWithLease: Boolean, indicator: ProgressIndicator?) {
        // TODO: implement (full source is private)
    }

    fun createBranch(name: String, startPoint: String, checkout: Boolean) {
        // TODO: implement (full source is private)
    }

    fun createTags(names: List<String>, target: String, message: String, force: Boolean) {
        // TODO: implement (full source is private)
    }

    fun stash(message: String, includeUntracked: Boolean) {
        // TODO: implement (full source is private)
    }

    companion object {
        /** The repository holding [dir] (any subfolder works), or null. */
        fun open(dir: Path): GitRepository? {
            // TODO: implement (full source is private)
            return null
        }
    }
}
