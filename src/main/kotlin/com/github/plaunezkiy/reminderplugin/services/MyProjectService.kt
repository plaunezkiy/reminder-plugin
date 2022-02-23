package com.github.plaunezkiy.reminderplugin.services

import com.intellij.openapi.project.Project
import com.github.plaunezkiy.reminderplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
