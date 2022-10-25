
// Demonstrate check boxes.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/* <applet code="CheckboxDemo" width=250 height=200>
</applet> */
public class CheckboxDemo extends Applet implements ItemListener
{
String msg = "";
Checkbox cb1, cb2, cb3, cb4;
public void init()
{
cb1 = new Checkbox("Windows 98/XP", null, true);
cb2 = new Checkbox("Windows NT/2000");
cb3 = new Checkbox("Solaris");
cb4 = new Checkbox("MacOS");
add(cb1);
add(cb2);
add(cb3);
add(cb4);
cb1.addItemListener(this);
cb2.addItemListener(this);
cb3.addItemListener(this);
cb4.addItemListener(this);
}
public void itemStateChanged(ItemEvent ie)
{
repaint();
}
public void paint(Graphics g)
{
msg = "Current state: ";
g.drawString(msg, 6, 80);
msg = " Windows 98/XP: " + cb1.getState();
g.drawString(msg, 6, 100);
msg = " Windows NT/2000: " + cb2.getState();
g.drawString(msg, 6, 120);
msg = " Solaris: " + cb3.getState();
g.drawString(msg, 6, 140);
msg = " MacOS: " + cb4.getState();
g.drawString(msg, 6, 160);
}
}
