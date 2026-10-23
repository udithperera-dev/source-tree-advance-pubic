package com.akurupela.sta.ui

import com.akurupela.sta.auth.GitAuthService
import com.akurupela.sta.git.GitAuth
import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.project.DumbAware
import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import com.intellij.ui.content.ContentFactory

class SourceTreeAdvanceToolWindowFactory : ToolWindowFactory, DumbAware {
    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        GitAuth.provider = ApplicationManager.getApplication().getService(GitAuthService::class.java)
        val content = ContentFactory.getInstance().createContent(SourceTreeAdvancePanel(project), "", false)
        toolWindow.contentManager.addContent(content)
    }
}
