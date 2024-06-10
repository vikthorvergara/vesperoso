package com.github.vikthorvergara.vesperoso.services

import com.intellij.openapi.components.Service
import com.intellij.openapi.diagnostic.thisLogger
import com.intellij.openapi.project.Project
import com.github.vikthorvergara.vesperoso.Bundle

@Service(Service.Level.PROJECT)
class ProjectService(project: Project) {

    init {
        thisLogger().info(Bundle.message("projectService", project.name))
    }
}
