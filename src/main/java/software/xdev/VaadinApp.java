
package software.xdev;

import static java.lang.String.valueOf;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;


@Route("")
public class VaadinApp extends Composite<VerticalLayout>
{
	
	private final Button btnClickMe = new Button("click me");
	private final Span lbClickCount = new Span("0");
	private final VerticalLayout layout = new VerticalLayout(this.btnClickMe, this.lbClickCount);
	
	private int clickcount = 0;
	
	public VaadinApp()
	{
		
		this.btnClickMe.addClickListener(event -> this.lbClickCount.setText(valueOf(++this.clickcount)));
		
		// code goes here
		
		// set the main Component
		this.getContent().add(this.layout);
		
	}
}
