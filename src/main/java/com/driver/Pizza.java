package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean isExtraCheeseAdded=false;
    private boolean isExtraToppingAdded=false;
    private boolean isTakeAwayRequired=false;
    private boolean isBillGenerator=false;
    private int getPriceExtraCheese=0;
    private int getPriceExtraTopping=0;
    private int getTakeAwayRequired=0;

    public Pizza(Boolean isVeg){
        this.getPriceExtraCheese=80;
        this.isVeg=isVeg;
        if(this.isVeg){
            this.price=300;
            this.getPriceExtraTopping=70;
        }else{
            this.price=400;
            this.getPriceExtraTopping=120;
        }
        this.getTakeAwayRequired=20;
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
                this.bill+="Extra Cheese Added: "+getPriceExtraCheese+"\n";
            }
            if(isExtraToppingAdded){
                this.bill+="Extra Toppings Added: "+getPriceExtraTopping+"\n";
            }
            if(isTakeAwayRequired){
                this.bill+="Paperbag Added: "+getTakeAwayRequired+"\n";
            }
            this.bill+="Total Price: "+price;

            isBillGenerator=true;
        }
        return this.bill;
    }
}
