class coffee{
  // complete the class as mentioned in the problem statement
  boolean hot;
  boolean creamy;
  boolean chocolateSauce;
  boolean milk;
  boolean high_water_pressure;
  
  public coffee(boolean hot, boolean creamy, boolean chocolateSauce, boolean milk, boolean high_water_pressure){
      this.hot=hot;
      this.creamy=creamy;
      this.chocolateSauce=chocolateSauce;
      this.milk=milk;
      this.high_water_pressure=high_water_pressure;
  }
  
  boolean mocha(){
      boolean flag=false;
      
      if(hot==true && creamy==true && chocolateSauce==false && milk==true && high_water_pressure==true){
          flag= true;
      }
      
      return flag;
  }
  
  boolean latte(){
      boolean flag=false;
      
      if(hot && creamy && chocolateSauce && milk && high_water_pressure){
          flag=true;
      }
      
      return flag;
  }
  
  boolean espresso(){
      
      boolean flag=false;
      
      if(hot==true && creamy==false && chocolateSauce==true && milk==true && high_water_pressure==false){
          flag=true;
      }
      
      return flag;
      
  }
  
  boolean frappuccino(){
      boolean flag=false;
      
      if(hot==false && creamy==true && chocolateSauce==true && milk==true && high_water_pressure==false){
          flag=true;
      }
      
      return flag;
  }
}
