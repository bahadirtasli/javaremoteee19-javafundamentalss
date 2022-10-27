package Exercise;

/**
 * Person model
 * Example of Encapsulation
 *
 * @author bahadir tasli
 */
public class Rectangle extends Shape{
    public class Shape {
        private int size;
        private String edge;
        private String corner;
        private int angle;

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public String getEdge() {
            return edge;
        }

        public void setEdge(String edge) {
            this.edge = edge;
        }

        public String getCorner() {
            return corner;
        }

        public void setCorner(String corner) {
            this.corner = corner;
        }

        public int getAngle() {
            return angle;
        }

        public void setAngle(int angle) {
            this.angle = angle;
        }

    }
}