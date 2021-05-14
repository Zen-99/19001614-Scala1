object Total extends App{
  def total(count:Double):Double=if(count>50)(24.95*0.6)*count+3+0.75*(count-50) else (24.95*0.6)*count+3;

  println(total(60));
}
