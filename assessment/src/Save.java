public void updateToNextGeneration() {
        //TODO generate the next generation state and update the space
        for (int i = 1; i < space.length - 1; i++) {
        for (int j = 1; j < space[0].length - 1; j++) {
        if (isGoingToBeAlive(i, j)) {
        space[i][j] = 1;
        } else {
        space[i][j] = 0;
        }
        }
        }
        }


public boolean isAlive(int rowIndex, int columnIndex) {
        //TODO return true or false either cell at position is alive or not
        return space[rowIndex][columnIndex] == 1;
        }

public boolean isGoingToBeAlive(int rowIndex, int columnIndex) {
        //TODO return true or false either cell at position is alive or not
        boolean flag = true;

        int a = space[rowIndex - 1][columnIndex - 1];
        int b = space[rowIndex - 1][columnIndex];
        int c = space[rowIndex - 1][columnIndex + 1];
        int d = space[rowIndex][columnIndex - 1];
        int e = space[rowIndex][columnIndex + 1];
        int f = space[rowIndex + 1][columnIndex - 1];
        int g = space[rowIndex + 1][columnIndex];
        int h = space[rowIndex + 1][columnIndex + 1];

        int numberOfNeighbours = a + b + c + d + e + f + g + h;

        if (space[rowIndex][columnIndex] == 1) {
        if (numberOfNeighbours < 2) {
        flag = false;
        }
        if (numberOfNeighbours == 2 || numberOfNeighbours == 3) {
        flag = true;
        }
        if (numberOfNeighbours > 3) {
        flag = false;
        }
        }
        if (space[rowIndex][columnIndex] == 0) {
        if (numberOfNeighbours == 3) {
        flag = true;
        } else {
        flag = false;
        }
        }

        return flag;
        }
