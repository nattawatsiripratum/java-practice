package citygridtester;

public class CityGrid {
    private int xCoor;
    private int yCoor;
    private final int gridSize;
    
    public CityGrid (int gridSize) {
        this.gridSize=gridSize;
        xCoor=yCoor=gridSize/2;
    }
    
    public void walk() {
        switch ((int) (Math.random()*4)) {
            case 0: xCoor++; break; // R
            case 1: xCoor--; break; // L
            case 2: yCoor--; break; // U
            case 3: yCoor++; break; // D
        }
    }
    
    public boolean isInCity() {
        return xCoor>=0 && xCoor<=gridSize && yCoor>=0 && yCoor<=gridSize; 
    }
    
    public void reset() {
        if (!isInCity()) xCoor=yCoor=gridSize/2;
    }
}
