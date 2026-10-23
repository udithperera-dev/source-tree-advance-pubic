package com.akurupela.sta.ui

import com.intellij.openapi.project.Project
import com.intellij.ui.components.JBLabel
import java.awt.BorderLayout
import javax.swing.JPanel
import javax.swing.SwingConstants

/**
 * Public incomplete UI scaffold. The full panel holds the repository tabs, the toolbar (commit, pull, push, fetch,
 * branch, stash, tag, sign-ins), the sidebar, History (commit graph, files, diff) and File status (stage files or
 * hunks, commit with options), and the Live preview / Logs rail.
 */
internal class SourceTreeAdvancePanel(project: Project) : JPanel(BorderLayout()) {
    init {
        add(JBLabel("Source Tree Advance — incomplete public source", SwingConstants.CENTER), BorderLayout.CENTER)
        // TODO: implement (full source is private)
    }
}
