package org.github.legioth.htmltemplate;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.router.Route;

@Route("custom")
public class CustomTemplateStream extends HtmlTemplate {
    @Id
    Div div;

    public CustomTemplateStream() {
        super("custom", () -> new ByteArrayInputStream("<div id=div>Custom</div>".getBytes(StandardCharsets.UTF_8)));

        // To verify that parsing acctually happened
        System.out.println(div.getText());
    }
}
