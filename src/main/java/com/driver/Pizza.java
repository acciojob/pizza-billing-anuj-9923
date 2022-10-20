package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean isExtraCheeseAdded;
    private boolean isExtraToppingAdded;
    private boolean isTakeAwayRequired;
    private boolean isBillGenerator=false;
    private int getPriceExtraCheese=0;
    private int getPriceExtraTopping=0;
    private int getTakeAwayRequired=0;

    public Pizza(Boolean isVeg){
        this.isExtraCheeseAdded=false;
        this.isExtraToppingAdded=false;
        this.isTakeAwayRequired=false;

        this.getPriceExtraCheese=80;
        this.isVeg=isVeg;
        this.getTakeAwayRequired=20;

        if(this.isVeg){
            this.price=300;
            this.getPriceExtraTopping=70;
        }else{
            this.price=400;
            this.getPriceExtraTopping=120;
        }
        this.bill="Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }


    public void addExtraCheese(){
        if(!isExtraCheeseAdded){
            this.price=this.price+this.getPriceExtraCheese;
            isExtraCheeseAdded=true;
        }
    }
    public void addExtraToppings(){
        if(!isExtraToppingAdded){
            this.price=this.price+this.getPriceExtraTopping;
            isExtraToppingAdded=true;
        }
    }

    public void addTakeaway(){
        if(!isTakeAwayRequired){
            this.price=this.price+this.getTakeAwayRequired;
            isTakeAwayRequired=true;
        }
    }

    public String getBill(){

        if(!isBillGenerator){
            if(isExtraCheeseAdded){
                this.bill=this.bill+"Extra Cheese Added: "+this.getPriceExtraCheese+"\n";
            }
            if(isExtraToppingAdded){
                this.bill=this.bill+"Extra Toppings Added: "+this.getPriceExtraTopping+"\n";
            }
            if(isTakeAwayRequired){
                this.bill=this.bill+"Paperbag Added: "+this.getTakeAwayRequired+"\n";
            }
            this.bill=this.bill+"Total Price: "+this.price;

            isBillGenerator=true;
        }
        return this.bill;
    }
}
