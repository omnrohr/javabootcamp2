package com.company.QuidditchGame.src.main.models;

import java.util.Arrays;

public class Team {
    private String house;
    private String keeper;
    private String seeker;
    private String[] chasers;
    private static final String POSITION_CHASER = "chaser";
    private static final String POSITION_SEEKER = "seeker";
    private static final String POSITION_KEEPER = "keeper";

    public Team(String house, String keeper, String seeker, String[] chasers){
        if (house == null || keeper == null || seeker == null || hasNull(chasers)){
            throw new IllegalArgumentException("none of fields Can be empty!");
        }
        if (house.isBlank() || seeker.isBlank() || keeper.isBlank() || hasBlank(chasers)){
            throw new IllegalArgumentException("none of fields Can be empty!");
        }
        if ( chasers.length !=3){
            throw new IllegalStateException("Chasers should be 3!");
        }
        this.house = house;
        this.keeper = keeper;
        this.seeker = seeker;
        this.chasers = Arrays.copyOf(chasers, chasers.length);
    }

    public Team (Team source){
        this.house = source.house;
        this.keeper= source.keeper;
        this.seeker = source.seeker;
        this.chasers = Arrays.copyOf(source.chasers, source.chasers.length);
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        checkParams(house);
        this.house = house;
    }

    public String getKeeper() {
        return keeper;
    }

    public void setKeeper(String keeper) {
        checkParams(keeper);
        this.keeper = keeper;
    }

    public String getSeeker() {
        return seeker;
    }

    public void setSeeker(String seeker) {
        checkParams(seeker);
        this.seeker = seeker;
    }

    public String[] getChasers() {
        return Arrays.copyOf(this.chasers, this.chasers.length);
    }

    public void setChasers(String[] chasers) {
        if (hasNull(chasers)|| hasBlank(chasers)){
            throw new IllegalArgumentException("Chasers can not be empty or space!");
        }
        this.chasers = Arrays.copyOf(chasers,chasers.length);
    }

    public static String getPositionChaser() {
         return POSITION_CHASER;
     }

     public static String getPositionSeeker() {
         return POSITION_SEEKER;
     }

     public static String getPositionKeeper() {
         return POSITION_KEEPER;
     }

     public static boolean hasNull(String[] chasers){
         for (int i = 0; i < chasers.length; i++) {
             if (chasers[i]==null)return true;
         }return false;
     }
     public static boolean hasBlank(String[] chasers){
        return Arrays.stream(chasers).anyMatch((item) -> item.isBlank());
     }

     private void checkParams(String param){
        if (param.isBlank()||param==null){
            throw new IllegalArgumentException(param+ "Can not be empty or blank!");
        }
     }

     public String toString (){
         return "House: " + this.house + "\n" +
                 "Keeper: " + this.keeper + "\n" +
                 "Seeker: "  + this.seeker + "\n" +
                 "Chasers: " + Arrays.toString(this.chasers) + "\n";
     }

}
