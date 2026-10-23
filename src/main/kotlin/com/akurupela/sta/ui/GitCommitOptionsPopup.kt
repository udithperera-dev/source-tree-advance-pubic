package com.akurupela.sta.ui

import com.intellij.openapi.project.Project
import javax.swing.JComponent

/**
 * Commit options next to Commit: Git (author, sign-off, signature, hooks), code actions before committing (reformat,
 * rearrange, optimize imports) and advanced checks (analyze code, new TODOs, a run configuration) before or after it.
 */
internal object GitCommitOptionsPopup {
    fun show(project: Project, anchor: JComponent, onChange: () -> Unit) {
        // TODO: implement (full source is private)
    }
}
