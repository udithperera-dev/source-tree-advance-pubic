package com.akurupela.sta.git

/** Simplified public models; the full ones carry more detail (ahead / behind, rename sources, conflict states). */

data class GitRefLabel(val name: String, val kind: Kind, val current: Boolean = false) {
    enum class Kind { HEAD, LOCAL, REMOTE, TAG }
}

data class GitCommit(
    val hash: String,
    val parents: List<String>,
    val authorName: String,
    val authorEmail: String,
    /** Epoch seconds. */
    val authorTime: Long,
    val refs: List<GitRefLabel>,
    val subject: String,
)

data class GitBranch(val name: String, val hash: String, val remote: Boolean, val current: Boolean = false, val upstream: String? = null)

data class GitTag(val name: String, val hash: String)

data class GitStash(val index: Int, val message: String, val hash: String)

/** One changed file; [index] / [workTree] are git's status letters for the staged and unstaged side. */
data class GitFileChange(val path: String, val index: Char, val workTree: Char, val origPath: String? = null)

data class GitWorkingStatus(
    val branch: String?,
    val staged: List<GitFileChange>,
    val unstaged: List<GitFileChange>,
    val conflicts: List<GitFileChange>,
)
