package org.github.legioth.htmltemplate;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("")
@Uses(VerticalLayout.class)
public class DemoView extends HtmlTemplate {

    @Id
    private TextField name;

    @Id
    private PasswordField password;

    @Id
    private Button submit;

    @Id
    private Div message;

    public DemoView() {
        System.out.println("Label: " + name.getLabel());
        System.out.println("Max length: " + name.getMaxLength());
        System.out.println("Reveal button visible: " + password.isRevealButtonVisible());

        submit.addClickListener(event -> {
            message.setText("Hello " + name.getValue() + " with password " + password.getValue());
        });
    }
}
