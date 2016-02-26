Q1
(a) Write a class GUI which extends JFrame with attributes button (type JButton, text "Double"), label (type JLabel, text "2") and textField (type JTextField, length 20). Also write the getter and setter methods of the attributes. The names of getter and setter methods should be getWord() and setWord() respectively if the attribute name is word. Add these attributes to the contentPane with FlowLayout manager.

写一个 GUI 类，要求继承 JFrame, 具有属性：JButton 类型且文字显示为 Double 的 button, JLabel 类型且文字显示为 2 的 label 以及 JTextField 类型且文本长度为 20 的 textField. 同时，写出这三个属性（attribute, 也叫字段 - field）分别对应的 getter 和 setter, 要求为：如果属性的名字是 word，那么getter 的方法名称为 getWord(), setter 的方法名称为 setWord()，将这三个属性添加到使用 FlowLayout 布局的 contentPane 中。

(b) Also add a menu item menuItem (type JMenuItem, text "Append") to an "Action" menu which is on the menu bar. Also write the getter and setter methods of menuItem and add it to the contentPane.

添加一个类型为 JMenu 且文字显示为 Append 的 menuItem 到菜单栏（menu bar）的 Action menu 上，同时为 menuItem 编写 getter 和 setter 且将其添加到 contentPane 上。

(c) Write appropriate code to handle the action of button. When it is clicked, the integer on label is doubled. If label contains 3 before the click, it now contains 6.

写一些代码处理 button 的操作，当 button 单击时，要求 label 上的数字显示为乘2 后的结果，如果 label 上显示为 3， 那么单击 button 后应该显示为 6.

(d) Write appropriate code to handle the action of menuItem. When it is selected, the text on textField is appended to that of label. If label contains 2 and textField contains 3, label will contains 23 after menuItem. is selected.

写一些代码处理 menuItem 的操作，当选中 menuItem （也就是 Append）时,  textField 中的数字会追加到 label 中，如果 label 显示为 2，textField 中输入 3， 候选选中 Append, 那么 label 中的数字就变为 23.

(e) Add a new button button2 (type JButton, text "Multiply") which, when clicked, multiply the integer in textField by the integer on label and put the result on label. 

添加一个类型为 JButton 且文字显示为 Multiply 的 button2, （添加监听事件）当单击时，将 label 上的数字和 textField 中的数字相乘，结果显示在 label 中