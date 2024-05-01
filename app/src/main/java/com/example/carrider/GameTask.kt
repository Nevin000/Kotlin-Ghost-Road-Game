package com.example.carrider

interface GameTask {
    fun closeGame(mScore:Int)
    abstract fun <GameView> GameView(c: MainActivity): GameView

}