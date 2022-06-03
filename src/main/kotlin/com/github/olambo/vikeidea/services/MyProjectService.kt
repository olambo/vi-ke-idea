package com.github.olambo.vikeidea.services

import com.intellij.openapi.project.Project
import com.github.olambo.vikeidea.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
