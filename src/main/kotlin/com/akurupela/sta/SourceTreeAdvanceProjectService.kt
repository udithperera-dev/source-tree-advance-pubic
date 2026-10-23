package com.akurupela.sta

import com.intellij.openapi.Disposable
import com.intellij.openapi.components.Service
import com.intellij.openapi.project.Project
import java.nio.file.Path

/** Parent [Disposable] for the tool window's UI, so the plugin unloads without an IDE restart. */
@Service(Service.Level.PROJECT)
class SourceTreeAdvanceProjectService(private val project: Project) : Disposable {
    override fun dispose() = Unit

    fun projectRoot(): Path? = project.basePath?.let { Path.of(it) }
}
