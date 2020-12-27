package lpk.basics

import javax.swing.ImageIcon
import javax.swing.JFrame
import javax.swing.SwingUtilities

fun main() {
    SwingUtilities.invokeLater { FirstProgram().doLaunch() }
}
class FirstProgram {

    fun tileColors() : Array<Array<Int>> {
        return arrayOf(
                arrayOf(0, 255),
                arrayOf(255, 0)
        )
    }

    fun doLaunch() {
        val frame = JFrame("Basics")
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.iconImage = ImageIcon("./src/lpk/basics/icon.png").image
        frame.add(TilePanel(tileColors()))
        frame.pack()
        frame.isVisible = true
    }
}
