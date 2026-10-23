package com.akurupela.sta.ui

import com.akurupela.sta.git.GitAuthMethod
import com.akurupela.sta.git.GitCredential
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.DialogWrapper
import com.intellij.ui.components.JBLabel
import javax.swing.JComponent

/** Sign in to one server by any method its scheme allows ([GitAuthMethod]); shown when a remote refuses. */
internal class GitSignInDialog(project: Project?, private val server: String?, failure: String?) : DialogWrapper(project, true) {
    class Result(val credential: GitCredential, val remember: Boolean)

    init {
        title = server?.let { "Sign in to $it" } ?: "Sign in to a Git server"
        init()
    }

    override fun createCenterPanel(): JComponent {
        // TODO: implement (full source is private)
        return JBLabel("Sign-in form")
    }

    fun result(): Result {
        // TODO: implement (full source is private)
        throw UnsupportedOperationException("private")
    }
}
