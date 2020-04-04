package com.example.lab1_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private ConsumtionStack consumtionStack;
    private int counter = 0;
    private boolean historyMode;
    private ConsumtionStack calculationHistory;
    private String tempConsumption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        consumtionStack = new ConsumtionStack(15); // максимальный размер числа
        calculationHistory = new ConsumtionStack(3);
        calculationHistory.push("История вычислений пуста");
    }

    public void numHandler_1(View view) {
        if (!historyMode) {
            if (startCheck()) {
                ((TextView) findViewById(R.id.textView)).setText("1");
                consumtionStack.push("1");
            } else {
                if (!consumtionStack.isFull()) {
                    ((TextView) findViewById(R.id.textView)).setText(((TextView) findViewById(R.id.textView)).getText() + "1");
                    consumtionStack.push("1");
                }
            }
        }
    }

    public void numHandler_2(View view) {
        if (!historyMode) {
            if (startCheck()) {
                ((TextView) findViewById(R.id.textView)).setText("2");
                consumtionStack.push("2");
            } else {
                if (!consumtionStack.isFull()) {
                    ((TextView) findViewById(R.id.textView)).setText(((TextView) findViewById(R.id.textView)).getText() + "2");
                    consumtionStack.push("2");
                }
            }
        }
    }

    public void numHandler_3(View view) {
        if (!historyMode) {
            if (startCheck()) {
                ((TextView) findViewById(R.id.textView)).setText("3");
                consumtionStack.push("3");
            } else {
                if (!consumtionStack.isFull()) {
                    ((TextView) findViewById(R.id.textView)).setText(((TextView) findViewById(R.id.textView)).getText() + "3");
                    consumtionStack.push("3");
                }
            }
        }
    }

    public void numHandler_4(View view) {
        if (!historyMode) {
            if (startCheck()) {
                ((TextView) findViewById(R.id.textView)).setText("4");
                consumtionStack.push("4");
            } else {
                if (!consumtionStack.isFull()) {
                    ((TextView) findViewById(R.id.textView)).setText(((TextView) findViewById(R.id.textView)).getText() + "4");
                    consumtionStack.push("4");
                }
            }
        }
    }

    public void numHandler_5(View view) {
        if (!historyMode) {
            if (startCheck()) {
                ((TextView) findViewById(R.id.textView)).setText("5");
                consumtionStack.push("5");
            } else {
                if (!consumtionStack.isFull()) {
                    ((TextView) findViewById(R.id.textView)).setText(((TextView) findViewById(R.id.textView)).getText() + "5");
                    consumtionStack.push("5");
                }
            }
        }
    }

    public void numHandler_6(View view) {
        if (!historyMode) {
            if (startCheck()) {
                ((TextView) findViewById(R.id.textView)).setText("6");
                consumtionStack.push("6");
            } else {
                if (!consumtionStack.isFull()) {
                    ((TextView) findViewById(R.id.textView)).setText(((TextView) findViewById(R.id.textView)).getText() + "6");
                    consumtionStack.push("6");
                }
            }
        }
    }

    public void numHandler_7(View view) {
        if (!historyMode) {
            if (startCheck()) {
                ((TextView) findViewById(R.id.textView)).setText("7");
                consumtionStack.push("7");
            } else {
                if (!consumtionStack.isFull()) {
                    ((TextView) findViewById(R.id.textView)).setText(((TextView) findViewById(R.id.textView)).getText() + "7");
                    consumtionStack.push("7");
                }
            }
        }
    }

    public void numHandler_8(View view) {
        if (!historyMode) {
            if (startCheck()) {
                ((TextView) findViewById(R.id.textView)).setText("8");
                consumtionStack.push("8");
            } else {
                if (!consumtionStack.isFull()) {
                    ((TextView) findViewById(R.id.textView)).setText(((TextView) findViewById(R.id.textView)).getText() + "8");
                    consumtionStack.push("8");
                }
            }
        }
    }

    public void numHandler_9(View view) {
        if (!historyMode) {
            if (startCheck()) {
                ((TextView) findViewById(R.id.textView)).setText("9");
                consumtionStack.push("9");
            } else {
                if (!consumtionStack.isFull()) {
                    ((TextView) findViewById(R.id.textView)).setText(((TextView) findViewById(R.id.textView)).getText() + "9");
                    consumtionStack.push("9");
                }
            }
        }
    }

    public void numHandler_0(View view) {
        if (!historyMode) {
            if (startCheck()) {
                ((TextView) findViewById(R.id.textView)).setText("0");
                consumtionStack.push("0");
            } else {
                if (!consumtionStack.isFull()) {
                    ((TextView) findViewById(R.id.textView)).setText(((TextView) findViewById(R.id.textView)).getText() + "0");
                    consumtionStack.push("0");
                }
            }
        }
    }

    public void toolHandler_dot(View view) {
        if (!historyMode) {
            if (startCheck()) {
                // нельзя начинать с точки число
            } else {
                if (!consumtionStack.isFull() && !consumtionStack.isContain(".") && !consumtionStack.isEmpty()) {
                    ((TextView) findViewById(R.id.textView)).setText(((TextView) findViewById(R.id.textView)).getText() + ".");
                    consumtionStack.push(".");
                }
            }
        }
    }

    public void meanHandler_plus(View view) {
        if (!historyMode) {
            if (startCheck()) {
                //начинать ввод с + незачем
            } else {
                if (MeanChecker.check(((TextView) findViewById(R.id.textView)).getText().toString())) {
                    consumtionStack = new ConsumtionStack(15);
                    ((TextView) findViewById(R.id.textView)).setText(((TextView) findViewById(R.id.textView)).getText() + " + ");
                }
            }
        }
    }

    public void meanHandler_multi(View view) {
        if (!historyMode) {
            if (startCheck()) {
                //начинать ввод с * незачем
            } else {
                if (MeanChecker.check(((TextView) findViewById(R.id.textView)).getText().toString())) {
                    consumtionStack = new ConsumtionStack(15);
                    ((TextView) findViewById(R.id.textView)).setText(((TextView) findViewById(R.id.textView)).getText() + " * ");
                }
            }
        }
    }

    public void meanHandler_div(View view) {
        if (!historyMode) {
            if (startCheck()) {
                //начинать ввод с / незачем
            } else {
                if (MeanChecker.check(((TextView) findViewById(R.id.textView)).getText().toString())) {
                    consumtionStack = new ConsumtionStack(15);
                    ((TextView) findViewById(R.id.textView)).setText(((TextView) findViewById(R.id.textView)).getText() + " / ");
                }
            }
        }
    }

    public void meanHandler_minus(View view) {
        if (!historyMode) {
            if (startCheck()) {
                ((TextView) findViewById(R.id.textView)).setText(" - ");
            } else {
                if (MeanChecker.check(((TextView) findViewById(R.id.textView)).getText().toString())) {
                    consumtionStack = new ConsumtionStack(15);
                    ((TextView) findViewById(R.id.textView)).setText(((TextView) findViewById(R.id.textView)).getText() + " - ");
                }
            }
        }
    }

    public void toolHandler_openBracket(View view) {
        if (!historyMode) {
            if (startCheck()) {
                ((TextView) findViewById(R.id.textView)).setText(" ( ");
                counter++;
            } else {
                char temp = ((TextView) findViewById(R.id.textView)).getText().toString().charAt(((TextView) findViewById(R.id.textView)).getText().toString().length() - 2);
                if (temp == '*' || temp == '/' || temp == '-' || temp == '+' || temp == '(') {
                    ((TextView) findViewById(R.id.textView)).setText(((TextView) findViewById(R.id.textView)).getText() + " ( ");
                    counter++;
                }
            }
        }
    }

    public void toolHandler_closeBracket(View view) {
        if (!historyMode) {
            if (startCheck()) {
                //нельзя начинать с закрытой скобки
            } else {
                char temp = ((TextView) findViewById(R.id.textView)).getText().toString().charAt(((TextView) findViewById(R.id.textView)).getText().toString().length() - 1);
                System.out.println(counter + " " + temp);
                if (counter > 0 && ((temp > 47 && temp < 58) || (temp == ')'))) {
                    ((TextView) findViewById(R.id.textView)).setText(((TextView) findViewById(R.id.textView)).getText() + " ) ");
                    counter--;
                }
            }
        }
    }

    public void toolHandler_clean(View view) {
        if (!historyMode) {
            counter = 0;
            ((TextView) findViewById(R.id.textView)).setText("Ввод");
            consumtionStack = new ConsumtionStack(15);
        }
    }

    public void toolHandler_chngmng(View view) {
        if (!historyMode) {
            if (startCheck()) {
                //нельзя ничего менять
            } else {
                char temp = ((TextView) findViewById(R.id.textView)).getText().toString().charAt(((TextView) findViewById(R.id.textView)).getText().toString().length() - 2);
                if (temp == 43) {
                    ((TextView) findViewById(R.id.textView)).setText(((TextView) findViewById(R.id.textView)).getText().toString().substring(0, ((TextView) findViewById(R.id.textView)).getText().toString().length() - 2) + "- ");
                }
                if (temp == 45) {
                    ((TextView) findViewById(R.id.textView)).setText(((TextView) findViewById(R.id.textView)).getText().toString().substring(0, ((TextView) findViewById(R.id.textView)).getText().toString().length() - 2) + "+ ");
                }
            }
        }
    }

    public void toolHandler_back(View view) {
        if (!historyMode) {
            if (startCheck()) {
                //нельзя ничего менять
            } else {
                if (BracketChecker.check(((TextView) findViewById(R.id.textView)).getText().toString())) {
                    if (Parser.check(((TextView) findViewById(R.id.textView)).getText().toString())) {
                        ((TextView) findViewById(R.id.textView)).setText("1 / ( " + ((TextView) findViewById(R.id.textView)).getText().toString() + " ) ");
                    }
                }
            }
        }
    }

    public void meanHandler_sqrt(View view) {
        if (!historyMode) {
            if (startCheck()) {
                ((TextView) findViewById(R.id.textView)).setText(" √ ( ");
                counter++;
            } else {
                char temp = ((TextView) findViewById(R.id.textView)).getText().toString().charAt(((TextView) findViewById(R.id.textView)).getText().toString().length() - 2);
                if (temp == '*' || temp == '/' || temp == '-' || temp == '+' || temp == '(') {
                    ((TextView) findViewById(R.id.textView)).setText(((TextView) findViewById(R.id.textView)).getText().toString() + " √ ( ");
                    counter++;
                }
            }
        }
    }

    public void toolHandler_history(View view) {
        if (historyMode) {
            ((TextView) findViewById(R.id.textView)).setText(tempConsumption);
            historyMode = false;
            ((Button)findViewById(R.id.button23)).setText("H");
        } else {
            historyMode = true;
            tempConsumption = ((TextView) findViewById(R.id.textView)).getText().toString();
            List<String> resultSet = calculationHistory.getAll();
            StringBuilder result = new StringBuilder();
            for(String str : resultSet){
                result.append(str);
            }
            ((Button)findViewById(R.id.button23)).setText("B");
            ((TextView) findViewById(R.id.textView)).setText(result.toString());
        }
    }

    public void toolHandler_calc(View view) throws ScriptException {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
        String early = ((TextView) findViewById(R.id.textView)).getText().toString();
        String members = Parser.getAllMembers(early);
        String result;
        if(startCheck()){
            return;
        }
        if(BracketChecker.check(early)){
            result = engine.eval(members).toString();
            if(result.equals("Infinity")){
                result = "Произошло деление на 0";
            }
            else{
                if(calculationHistory.peek().equals("История вычислений пуста")){
                    calculationHistory.pop();
                    calculationHistory.push(members + " = " + result + "\n");
                }
                else if(calculationHistory.isFull()){
                    String temp_1 = calculationHistory.pop();
                    String temp_2 = calculationHistory.pop();
                    calculationHistory.pop();
                    calculationHistory.push(temp_2);
                    calculationHistory.push(temp_1);
                    calculationHistory.push(early + " = " + result + "\n");
                }
                else{
                    calculationHistory.push(early + " = " + result + "\n");
                }
            }
        }
        else{
            result = "Неправильная скобочная структура";
        }
        counter = 0;
        ((TextView) findViewById(R.id.textView)).setText(result);
    }

    private boolean startCheck() {
        return ((TextView) findViewById(R.id.textView)).getText().toString().equals("Ввод")
                || ((TextView) findViewById(R.id.textView)).getText().toString().equals("Произошло деление на 0")
                || ((TextView) findViewById(R.id.textView)).getText().toString().equals("Неправильная скобочная структура");
    }
}
