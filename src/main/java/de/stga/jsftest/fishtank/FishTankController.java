package de.stga.jsftest.fishtank;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class FishTankController implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<FishTank> fishTankList = new ArrayList<>();

    private List<ColumnModel> columnModelList;

    public List<ColumnModel> getColumnModelList() {
        return this.columnModelList;
    }

    public List<FishTank> getFishTankList() {
        return this.fishTankList;
    }

    private void createFishColumnModel() {
        this.columnModelList = new ArrayList<>();
        this.columnModelList.add(new ColumnModel("Number of Fish", "numberOfFish"));
        this.columnModelList.add(new ColumnModel("Color of Fish", "colorOfFish"));
    }

    @PostConstruct
    private void init() {
        this.createFishColumnModel();
        this.fishTankList.add(new FishTank("Fishtank for Singles", "small", "10", "blue"));
        this.fishTankList.add(new FishTank("Fishtank for Business", "big", "100", "red"));
    }

}
