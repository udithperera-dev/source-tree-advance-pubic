package com.akurupela.sta.ui

import javax.swing.JPanel

/**
 * Repository tabs over the toolbar: the project's repository first, then up to 2 more, each with a small close mark,
 * then Add repository. A tab's repository loads when the tab is clicked.
 */
internal class GitRepoTabs(
    private val onSelect: (String?) -> Unit,
    private val onAdd: () -> Unit,
    private val onClose: (String) -> Unit,
) : JPanel() {
    fun update(projectTitle: String, open: List<String>, selected: String?) {
        // TODO: implement (full source is private)
    }
}
