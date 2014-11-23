
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    //Nos guarda las horas
    private NumberDisplay hours;
    //Nos guarda los minutos
    private NumberDisplay minutes;
    //Un string de 5 caracteres: la hora, dos puntos y los minutos
    private String displayString;
    //Nos guarda el año.
    private NumberDisplay year;
    //Nos guarda los dias
    private NumberDisplay day;
    //Nos guarda el mes
    private NumberDisplay month;
    // String de 8 caracteres que nos guarda la fecha como: dia/mes/año
    private String dateString;
    /**
     * Constructor sin parametros de la clase ClockDisplay, reloj a 00:00
     */
    public ClockDisplay()
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        day = new NumberDisplay(31);
        month = new NumberDisplay(13);
        year = new NumberDisplay(99);
        updateDisplay();
        
        
    }
    /**
     * Constructor con parametros de la clase ClockDisplay
     */
    public ClockDisplay(int newHours, int newMinutes, int newYear, int newDay, int newMonth)
    {   
        hours = new NumberDisplay(24);
        hours.setValue(newHours);
        minutes = new NumberDisplay(60);
        minutes.setValue(newMinutes);
        day = new NumberDisplay(31);
        day.setValue(newDay);
        month = new NumberDisplay(13);
        month.setValue(newMonth);
        year = new NumberDisplay(99);
        year.setValue(newYear);
        updateDisplay();
    }  
    /**
     * Metodo que fija unas horas y minutos a la hora actual
     */
    public void setTime(int actualHours, int actualMinutes, int actualDay, int actualMonth, int actualYear)
    {
        hours.setValue(actualHours);
        minutes.setValue(actualMinutes);
        day.setValue(actualDay);
        month.setValue(actualMonth);
        year.setValue(actualYear);
        updateDisplay();
    }
    /**
     * Metodo que muestra en una cadena de 5 caracteres con la hora y los minutos separados por dos puntos, en formato de 12 horas
     */
    public String getTime() 
    {
       return displayString;
    }
    /**
     * Metodo que hace avanzar un minuto la hora actual que marca el reloj
     */
    public void timeTick()
    {
        minutes.increment();
        if(minutes.getValue()==0)   
        {
            hours.increment();
        }
        updateDisplay();
    }
    /**
     * Actualiza el atributo displayString
     */
    private void updateDisplay()
    {
      int actualHora = hours.getValue();
      if(actualHora < 12)
      {
          if (actualHora == 0)
          {
              displayString = "12"+ ":" + minutes.getDisplayValue() + " am";
          }
          else
          {
             displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue() + " am";
          }

      }
      else
      {
          if (actualHora == 12)
          {
              displayString = actualHora + ":" + minutes.getDisplayValue() + " pm";
          }
          else
          { 
              if((actualHora-12) <10 )
              {
                  displayString = "0" + (actualHora-12) + ":" + minutes.getDisplayValue() + " pm";
              }
              else
              {
                  displayString = (actualHora-12) + ":"  + minutes.getDisplayValue() + " pm";
              }
          }
      }
    }
     /**
     * Actualiza la fecha
     */
    private void updateDate()
    {
        dateString = day.getDisplayValue() + "/" + month.getDisplayValue() + "/" + year.getDisplayValue();
    }
}

}
