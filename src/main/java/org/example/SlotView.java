/*package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class SlotView extends JPanel {
    private final ParkingLot parkingLot;

    public SlotView(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
        setPreferredSize(new Dimension(400, 200));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        List<Slot> slots = parkingLot.getSlots();
        int totalSlots = slots.size();
        int cols = 5;
        int rows = (int) Math.ceil((double) totalSlots / cols);

        int boxSize = 50;
        int gap = 10;

        for (int i = 0; i < totalSlots; i++) {
            int row = i / cols;
            int col = i % cols;
            int x = col * (boxSize + gap) + gap;
            int y = row * (boxSize + gap) + gap;


            if (slots.get(i).isOccupied()) {
                g.setColor(Color.RED);
            } else {
                g.setColor(Color.GREEN);
            }
            g.fillRect(x, y, boxSize, boxSize);


            g.setColor(Color.BLACK);
            g.drawRect(x, y, boxSize, boxSize);


           String label = slots.get(i).isOccupied()
                    ? slots.get(i).getClass().getPlate()
                    : String.valueOf(i);

            g.setColor(Color.BLACK);
            g.drawString(label, x + 5, y + boxSize / 2);
        }
    }

    public void refresh() {
        repaint();
    }
}
*/
