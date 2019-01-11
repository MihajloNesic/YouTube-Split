package com.sheinh.ytsplit

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.io.IOException


class MainApp : Application() {
	private lateinit var controller : Controller
	override fun start(stage : Stage) {
		if (isMac && !Dependencies.check) {
			Dependencies.handleMacDependencies(stage)
		} else startMainApp(stage)
	}

	private fun startMainApp(stage : Stage) {
		controller = Controller(stage)
		var fxmlLoader = FXMLLoader(javaClass.getResource("/FirstPane.fxml"))
		fxmlLoader.setController(controller)
		var root = fxmlLoader.load<Any>() as Parent
		controller.firstPaneInit()
		controller.firstPane = root
		stage.title = "YouTube Split"
		stage.scene = Scene(root)
		stage.scene.stylesheets.add("style.css")
		stage.isResizable = false
		stage.show()
		GlobalScope.launch {
			controller.getDependenciesWin()
			fxmlLoader = FXMLLoader(javaClass.getResource("/SecondPane.fxml"))
			fxmlLoader.setController(controller)
			root = fxmlLoader.load<Any>() as Parent
			controller.secondPane = root
			controller.secondPaneInit()
		}
	}
}
@Throws(IOException::class)
fun main(args : Array<String>) {
	Application.launch(MainApp::class.java, *args)
}