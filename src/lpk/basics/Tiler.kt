package lpk.basics

import java.awt.Color
import java.awt.Graphics
import java.awt.Dimension
import javax.swing.JPanel

class TilePanel(private val tileColors: Array<Array<Int>>) : JPanel() {
    private val pictureSize = 200
    override fun getPreferredSize(): Dimension {
        return Dimension(pictureSize, pictureSize)
    }

    override fun paintComponent(graphics: Graphics) {
        super.paintComponent(graphics)

        val numberOfTilesPerSide = tileColors.size
        val sizeOfEachTile = pictureSize / numberOfTilesPerSide
        for (row in 0 until numberOfTilesPerSide) {
            for (column in 0 until numberOfTilesPerSide) {
                val offsetX = column * sizeOfEachTile
                val offsetY = row * sizeOfEachTile
                val intensity = tileColors[row][column]
                val tileColor = Color(intensity, intensity, intensity)
                graphics.color = tileColor
                graphics.fillRect(offsetX, offsetY, sizeOfEachTile, sizeOfEachTile)
            }
        }
    }
}