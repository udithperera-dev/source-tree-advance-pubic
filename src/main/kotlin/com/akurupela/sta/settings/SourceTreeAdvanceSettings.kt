package com.akurupela.sta.settings

import com.intellij.openapi.components.PersistentStateComponent
import com.intellij.openapi.components.Service
import com.intellij.openapi.components.State
import com.intellij.openapi.components.Storage
import com.intellij.openapi.components.StoragePathMacros
import com.intellij.openapi.project.Project

/** Per-project, per-user state in the project's workspace file (not shared through version control). */
@Service(Service.Level.PROJECT)
@State(name = "SourceTreeAdvanceSettings", storages = [Storage(StoragePathMacros.WORKSPACE_FILE)])
class SourceTreeAdvanceSettings : PersistentStateComponent<SourceTreeAdvanceSettings.State> {
    data class State(
        /** History scope (LOCAL / ALL / CURRENT), author filter (email), open view (HISTORY / STATUS), push after commit. */
        var gitTabScope: String = "LOCAL",
        var gitTabAuthor: String = "",
        var gitTabView: String = "HISTORY",
        var gitTabPushAfterCommit: Boolean = false,
        /** Repositories open in tabs next to the project's own, until their tab is closed. */
        var openRepositories: MutableList<String> = mutableListOf(),
        /** Commit options. */
        var commitAuthor: String = "",
        var commitSignOff: Boolean = false,
        var commitSign: Boolean = false,
        var commitRunHooks: Boolean = true,
        var commitReformat: Boolean = false,
        var commitRearrange: Boolean = false,
        var commitOptimizeImports: Boolean = false,
        var commitAnalyze: Boolean = false,
        var commitCheckTodo: Boolean = false,
        var commitRunConfig: Boolean = false,
        var commitRunConfigName: String = "",
        var commitChecksAfter: Boolean = false,
    )

    var stored: State = State()

    override fun getState(): State = stored

    override fun loadState(state: State) {
        stored = state
    }

    companion object {
        fun getInstance(project: Project): SourceTreeAdvanceSettings = project.getService(SourceTreeAdvanceSettings::class.java)
    }
}
