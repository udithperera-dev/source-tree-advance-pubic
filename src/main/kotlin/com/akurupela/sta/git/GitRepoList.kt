package com.akurupela.sta.git

/** Repositories open in tabs next to the project's own: at most [MAX], kept until their tab is closed. */
object GitRepoList {
    const val MAX = 2

    enum class Outcome { ADDED, IS_PROJECT, ALREADY_OPEN, FULL }

    fun add(open: List<String>, root: String, projectRoot: String?): Pair<Outcome, List<String>> {
        // TODO: implement (full source is private)
        return Outcome.FULL to open
    }
}
