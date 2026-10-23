package com.akurupela.sta.git

import com.intellij.openapi.progress.ProgressIndicator
import java.nio.file.Path

/**
 * Runs the `git` CLI in [repoRoot]: stdout and stderr read concurrently, no terminal prompts, cancellable through a
 * [ProgressIndicator]. Network commands sign in through [GitAuth.provider] and are tried again after a new sign-in.
 */
class GitCli(val repoRoot: Path, private val log: (String) -> Unit = {}) {
    class Result(val exitCode: Int, val stdout: String, val stderr: String) {
        val ok: Boolean get() = exitCode == 0
    }

    fun run(vararg args: String, input: String? = null, indicator: ProgressIndicator? = null, logCommand: Boolean = false): Result {
        // TODO: implement (full source is private)
        return Result(-1, "", "private")
    }

    /** URLs of every remote, with `insteadOf` applied. */
    fun remoteUrls(): List<String> {
        // TODO: implement (full source is private)
        return emptyList()
    }
}
