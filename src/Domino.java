public class Domino {
    private int top;
    private int bottom;

    // Default constructor
    public Domino() {
        this.top = 0;
        this.bottom = 0;
    }

    // Overloading constructor
    public Domino(int top, int bottom) {
        this.top = top;
        this.bottom = bottom;
    }

    // Getters
    public int getTop() {
        return top;
    }

    public int getBottom() {
        return bottom;
    }

    // Setters
    public void setTop(int top) {
        this.top = top;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    // toString method to display the domino as a fraction
    public String toString() {
        return top + "/" + bottom;
    }

    // flip method to switch the order of top and bottom
    public void flip() {
        int temp = top;
        top = bottom;
        bottom = temp;
    }

    // settle method to compare top and bottom values and order them
    public void settle() {
        if (top > bottom) {
            flip();
        }
    }

    // compareTo method to compare the smallest value of each domino
    public int compareTo(Domino other) {
        if (Math.min(this.top, this.bottom) < Math.min(other.top, other.bottom)) {
            return -1;
        } else if (Math.min(this.top, this.bottom) > Math.min(other.top, other.bottom)) {
            return 1;
        } else {
            // If the smallest values are equal, compare the largest values
            if (Math.max(this.top, this.bottom) < Math.max(other.top, other.bottom)) {
                return -1;
            } else if (Math.max(this.top, this.bottom) > Math.max(other.top, other.bottom)) {
                return 1;
            }
        }
        return 0;
    }

    // compareToWeight method to compare the total number of dots
    public int compareToWeight(Domino other) {
        int thisWeight = this.top + this.bottom;
        int otherWeight = other.top + other.bottom;
        if (thisWeight < otherWeight) {
            return -1;
        } else if (thisWeight > otherWeight) {
            return 1;
        }
        return 0;
    }

    // canConnect method to check if the two dominoes can connect
    public boolean canConnect(Domino other) {
        return this.top == other.top || this.top == other.bottom || this.bottom == other.top || this.bottom == other.bottom;
    }
}

