{ project ->
    File artifact = file("${buildDir}/libs/${project.name}.jar") //shadowed artifact
    assert artifact.exists()

    File shadow = file("${buildDir}/libs/MyShadowBaseNameAttached-shadow.jar") //unshadowed
    assert shadow.exists()

    File repoOriginal = new File("${project.repositories.mavenLocal().url}/org/gradle/plugins/shadow/its/bna/baseNameAttached/1.0/baseNameAttached-1.0.jar" - 'file:')
    assert repoOriginal.exists()

    File repoShadow = new File("${project.repositories.mavenLocal().url}/org/gradle/plugins/shadow/its/bna/baseNameAttached/1.0/baseNameAttached-1.0-shadow.jar" - 'file:')
    assert repoShadow.exists()
}