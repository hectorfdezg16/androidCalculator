package grup4.dsa.upc.eetac.androidcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

// calculadora muy parecido al estilo MACOS
// mismo mapa de colores (check)
public class MainActivity extends AppCompatActivity {

    //declaracion objeto Button de todos nuestros diferentes botones
    private Button btn_sin;
    private Button btn_delete;
    private Button btn_clear;
    private Button btn_percentage;
    private Button btn_division;
    private Button btn_cos;
    private Button btn_seven;
    private Button btn_eight;
    private Button btn_product;
    private Button btn_nine;
    private Button btn_tan;
    private Button btn_four;
    private Button btn_five;
    private Button btn_six;
    private Button btn_substract;
    private Button btn_e;
    private Button btn_one;
    private Button btn_two;
    private Button btn_three;
    private Button btn_add;
    private Button btn_pi;
    private Button btn_zero;
    private Button btn_point;
    private Button btn_equal;
    //variable de cadena de caracteres para guardar temporalmente todos los numeros que insertemos
    private String present, operator, backup;
    //resultado de todas nuestras operaciones
    private double result, angleInDegree, angleInRadian;

    //declaracion variable TextView donde añadiremos respuesta calculadora
    private TextView text_response;

    //nos faltara declaracion variable "switch" para manejarlo
    private Switch switchdeg;

    //variable boolean para comprobar estado switch
    private Boolean switchstate= switchdeg.isChecked();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //capturar nuestros botones del layout en una variable
        btn_sin = (Button)findViewById(R.id.sinButton);
        btn_delete = (Button)findViewById(R.id.deleteButton);
        btn_clear = (Button)findViewById(R.id.clearButton);
        btn_percentage = (Button)findViewById(R.id.percentageButton);
        btn_division = (Button)findViewById(R.id.divisionButton);
        btn_cos = (Button)findViewById(R.id.cosButton);
        btn_seven = (Button)findViewById(R.id.sevenButton);
        btn_eight = (Button)findViewById(R.id.eightButton);
        btn_product = (Button)findViewById(R.id.productButton);
        btn_nine = (Button)findViewById(R.id.nineButton);
        btn_tan = (Button)findViewById(R.id.tanButton);
        btn_four = (Button)findViewById(R.id.fourButton);
        btn_five = (Button)findViewById(R.id.fiveButton);
        btn_six = (Button)findViewById(R.id.sixButton);
        btn_substract = (Button)findViewById(R.id.substractButton);
        btn_e = (Button)findViewById(R.id.eButton);
        btn_one = (Button)findViewById(R.id.oneButton);
        btn_two = (Button)findViewById(R.id.twoButton);
        btn_three = (Button)findViewById(R.id.threeButton);
        btn_add = (Button)findViewById(R.id.addButton);
        btn_pi = (Button)findViewById(R.id.piButton);
        btn_zero = (Button)findViewById(R.id.zeroButton);
        btn_point = (Button)findViewById(R.id.pointButton);
        btn_equal = (Button)findViewById(R.id.equalButton);
        text_response=(TextView)findViewById(R.id.textView);
        switchdeg=(Switch)findViewById(R.id.switch1);

        //ahora vamos con la implementacion de la interfaz setOnClickListener que llevara dentro el metodo onClick
        //esto es un clase anonima porque es una interfaz que no requiere implements en el MainActivity
        // primero crearemos todos los eventos de cada numero el "0" lo trataremos de forma especial / luego lo veremos
        btn_one.setOnClickListener(new View.OnClickListener() {

            //cuerpo sobrescrito
            @Override
            public void onClick(View v) {

                //aquí es lo que va a realizar botón al pusarlo
                //mostrar es una variable string que recoge el texto del text view, lo concatena con su número y
                //establece de nuevo el texto diferente en el TextView
                present = text_response.getText().toString();
                present=present + "1";
                text_response.setText(present);
            }
        });

        btn_two.setOnClickListener(new View.OnClickListener() {

            //cuerpo sobrescrito
            @Override
            public void onClick(View v) {

                //aquí es lo que va a realizar botón al pusarlo
                present= text_response.getText().toString();
                present=present + "2";
                text_response.setText(present);
            }
        });

        btn_three.setOnClickListener(new View.OnClickListener() {

            //cuerpo sobrescrito
            @Override
            public void onClick(View v) {

                //aquí es lo que va a realizar botón al pusarlo
                present= text_response.getText().toString();
                present=present + "3";
                text_response.setText(present);
            }
        });

        btn_four.setOnClickListener(new View.OnClickListener() {

            //cuerpo sobrescrito
            @Override
            public void onClick(View v) {

                //aquí es lo que va a realizar botón al pusarlo
                present= text_response.getText().toString();
                present=present + "4";
                text_response.setText(present);
            }
        });

        btn_five.setOnClickListener(new View.OnClickListener() {

            //cuerpo sobrescrito
            @Override
            public void onClick(View v) {

                //aquí es lo que va a realizar botón al pusarlo
                present= text_response.getText().toString();
                present=present + "5";
                text_response.setText(present);
            }
        });

        btn_six.setOnClickListener(new View.OnClickListener() {

            //cuerpo sobrescrito
            @Override
            public void onClick(View v) {

                //aquí es lo que va a realizar botón al pusarlo
                present= text_response.getText().toString();
                present=present + "6";
                text_response.setText(present);
            }
        });

        btn_seven.setOnClickListener(new View.OnClickListener() {

            //cuerpo sobrescrito
            @Override
            public void onClick(View v) {

                //aqui es lo que va a realizar boton al pusarlo
                present= text_response.getText().toString();
                present=present + "7";
                text_response.setText(present);
            }
        });

        btn_eight.setOnClickListener(new View.OnClickListener() {

            //cuerpo sobrescrito
            @Override
            public void onClick(View v) {

                //aquí es lo que va a realizar botón al pusarlo
                present= text_response.getText().toString();
                present=present + "8";
                text_response.setText(present);
            }
        });

        btn_nine.setOnClickListener(new View.OnClickListener() {

            //cuerpo sobrescrito
            @Override
            public void onClick(View v) {

                //aquí es lo que va a realizar botón al pusarlo
                present= text_response.getText().toString();
                present=present + "9";
                text_response.setText(present);
            }
        });

        //ahora programaremos la implementación del boton cero
        //es un poco diferente por no poderse utilizar siempre que queramos
        btn_zero.setOnClickListener(new View.OnClickListener() {

            //cuerpo sobrescrito
            @Override
            public void onClick(View v) {

                //creamos if y else por si al principio nuestro TextView esta vacío le diga al usuario que no se puede...
                //introducir un cero si no hay otro número previamente
                //enviamos un toast para notificarle del error cometido
                if(text_response.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"¡Ya hay un cero en pantalla!", Toast.LENGTH_SHORT).show();
                }

                //si el TextView no está vacio entonces ya podemos introducir el cero y concatenerlo con otra operación
                else{
                    present= text_response.getText().toString();
                    present=present + "0";
                    text_response.setText(present);
                }

            }
        });

        btn_point.setOnClickListener(new View.OnClickListener() {

            //cuerpo sobrescrito
            @Override
            public void onClick(View v) {

                //en la función punto tenemos que agregar if y else por si usuario introduce un punto...
                //sin previamente haber introducido nada, de esta manera se lo pondremos nosotros...
                //indicando que empieza con un decimal e inhabilitamos el botón punto para que...
                //no lo vuelva a pulsar seguidamente (en las dos opciones)
                if(text_response.getText().toString().isEmpty()){
                    present = text_response.getText().toString();
                    present=present + "0.";
                    text_response.setText(present);
                    btn_point.setEnabled(false);
                }
                else{
                    //aquí es lo que va a realizar botón al pusarlo
                    present= text_response.getText().toString();
                    present=present + ".";
                    text_response.setText(present);
                    btn_point.setEnabled(false);
                }
            }
        });

        //ahora empezamos a poner funciones de los botones operadores
        //empezamos por la función suma
        btn_add.setOnClickListener(new View.OnClickListener() {

            //cuerpo sobrescrito
            @Override
            public void onClick(View v) {

                //aquí es lo que va a realizar botón al pusarlo
                backup= text_response.getText().toString();
                operator="+";
                text_response.setText("");
                //habilitamos el botón punto por si quiere meter un número decimal a continuación
                btn_point.setEnabled(true);
            }
        });

        //seguimos con la función resta
        btn_substract.setOnClickListener(new View.OnClickListener() {

            //cuerpo sobrescrito
            @Override
            public void onClick(View v) {

                //aquí es lo que va a realizar botón al pusarlo
                backup= text_response.getText().toString();
                operator="-";
                text_response.setText("");
                //habilitamos el botón punto por si quiere meter un número decimal a continuación
                btn_point.setEnabled(true);
            }
        });

        //función multiplicación
        btn_product.setOnClickListener(new View.OnClickListener() {

            //cuerpo sobrescrito
            @Override
            public void onClick(View v) {

                //aquí es lo que va a realizar botón al pusarlo
                backup= text_response.getText().toString();
                operator="x";
                text_response.setText("");
                //habilitamos el botón punto por si quiere meter un número decimal a continuación
                btn_point.setEnabled(true);
            }
        });

        //función división
        btn_division.setOnClickListener(new View.OnClickListener() {

            //cuerpo sobrescrito
            @Override
            public void onClick(View v) {

                //aquí es lo que va a realizar botón al pusarlo
                backup= text_response.getText().toString();
                operator="/";
                text_response.setText("");
                //habilitamos el botón punto por si quiere meter un número decimal a continuación
                btn_point.setEnabled(true);
            }
        });

        //función clear (botón borrar todos los procesos calculadora)
        btn_clear.setOnClickListener(new View.OnClickListener() {

            //cuerpo sobrescrito
            @Override
            public void onClick(View v) {

                //aquí es lo que va a realizar botón al pusarlo
                //en este caso limpia todos los caracteres y presenta en patalla el present que está vacío
                present= "";
                text_response.setText(present);
                backup="";
                operator="";
                //habilitamos el botón punto por si quiere meter un número decimal a continuación
                btn_point.setEnabled(true);
            }
        });

        //función delete (elimina número/s de derecha a izquierda)
        btn_delete.setOnClickListener(new View.OnClickListener() {

            //cuerpo sobrescrito
            @Override
            public void onClick(View v) {

                //aquí es lo que va a realizar botón al pusarlo
                present= text_response.getText().toString();
                present=present.substring(0,present.length()-1);
                text_response.setText(present);
                //habilitamos el botón punto por si quiere meter un número decimal a continuación
                btn_point.setEnabled(true);
            }
        });

        //empezamos con las funciones trigonométricas
        //empezamos con la operación Sin
        btn_sin.setOnClickListener(new View.OnClickListener() {

            //cuerpo sobrescrito
            @Override
            public void onClick(View v) {

                //si el TextView está vacío no se podrá ejecutar la operación Sin...
                //y se lo notificaremos al usuario mediante un Toast
                if(text_response.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"¡Introduce un número antes de aplicar la operación Sin", Toast.LENGTH_SHORT).show();
                }
                else{
                    //aquí es lo que va a realizar botón al pusarlo
                    //capturamos lo que hay en el TextView
                    backup= text_response.getText().toString();
                    //las operaciones trigonométricas no las vamos a hacer igual que las otras operaciones...
                    //ya que sería un poco complejo hacerlo para añadir otro número seguidamente...
                    //nosotros en el momento de dar al botón Sin ya le mostraremos el resultado
                    result=Math.sin(Double.parseDouble(backup));
                    text_response.setText(String.valueOf(result));
                    //deshabilitamos el botón punto para que no introduzca otro número...
                    //sin previamente introducir la operación que quiera realizar
                    btn_point.setEnabled(false);
                }
            }
        });

        //seguimos con la operación Cos
        btn_cos.setOnClickListener(new View.OnClickListener() {

            //cuerpo sobrescrito
            @Override
            public void onClick(View v) {
                if(text_response.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"¡Introduce un número antes de aplicar la operación Cos", Toast.LENGTH_SHORT).show();
                }
                else{
                    backup= text_response.getText().toString();
                    result=Math.cos(Double.parseDouble(backup));
                    text_response.setText(String.valueOf(result));
                    btn_point.setEnabled(false);
                }
            }
        });

        //seguimos con la operación Tan
        btn_tan.setOnClickListener(new View.OnClickListener() {

            //cuerpo sobrescrito
            @Override
            public void onClick(View v) {
                if(text_response.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"¡Introduce un número antes de aplicar la operación Tan", Toast.LENGTH_SHORT).show();
                }
                else{
                    backup= text_response.getText().toString();
                    result=Math.tan(Double.parseDouble(backup));
                    text_response.setText(String.valueOf(result));
                    btn_point.setEnabled(false);
                }
            }
        });

        //introducir el número PI
        btn_pi.setOnClickListener(new View.OnClickListener() {

            //cuerpo sobrescrito
            @Override
            public void onClick(View v) {
                if(text_response.getText().toString().isEmpty()){
                    present= text_response.getText().toString();
                    present=present + Math.PI;
                    text_response.setText(present);
                }
                else{
                    Toast.makeText(MainActivity.this,"¡Haz una operación antes de utilizar el número PI!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //introducir el número e
        btn_e.setOnClickListener(new View.OnClickListener() {

            //cuerpo sobrescrito
            @Override
            public void onClick(View v) {
                if(text_response.getText().toString().isEmpty()){
                    present= text_response.getText().toString();
                    present=present + Math.E;
                    text_response.setText(present);
                }
                else{
                    Toast.makeText(MainActivity.this,"¡Haz una operación antes de utilizar el número e!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //introducir el porcentaje
        btn_percentage.setOnClickListener(new View.OnClickListener() {

            //cuerpo sobrescrito
            @Override
            public void onClick(View v) {
                if(text_response.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"¡Introduce un número para poder hacer el tanto por ciento!", Toast.LENGTH_SHORT).show();
                }
                else{
                    backup= text_response.getText().toString();
                    result=Double.parseDouble(backup)/100;
                    text_response.setText(String.valueOf(result));
                    btn_point.setEnabled(false);
                }
            }
        });

        //operación switch
        //REVISAR ESTA OPERACIÓN
        //switchdeg.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View v) {
        //        if(view.getId()==R.id.switch1){
        //            if(switchdeg.isChecked()){
        //                angleInDegree= Double.parseDouble(text_response.getText().toString());
        //                angleInRadian=Math.toRadians(angleInDegree);
        //            }
        //        }
        //        else{}
        //    }
        //});

        //función igual
        btn_equal.setOnClickListener(new View.OnClickListener() {

            //cuerpo sobrescrito
            @Override
            public void onClick(View v) {

                //que hacer en caso de que el usario pulse igual
                present=text_response.getText().toString();
                present=present+"1";

                //hacemos las condiciones de cada operador
                //recogemos los dos valores: el de reserva y el actual en el TextView...
                //los pasamos a double, hacemos la operación e imprimimos en el TextView el resultado
                if(operator.equals("+")){
                    result=Double.parseDouble(backup) + Double.parseDouble(text_response.getText().toString());
                    text_response.setText(String.valueOf(result));
                }

                if(operator.equals("-")){
                    result=Double.parseDouble(backup) - Double.parseDouble(text_response.getText().toString());
                    text_response.setText(String.valueOf(result));
                }

                if(operator.equals("x")){
                    result=Double.parseDouble(backup) * Double.parseDouble(text_response.getText().toString());
                    text_response.setText(String.valueOf(result));
                }

                if(operator.equals("/")){
                    result=Double.parseDouble(backup) / Double.parseDouble(text_response.getText().toString());
                    text_response.setText(String.valueOf(result));
                }
            }
        });



    }
}
