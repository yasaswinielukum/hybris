/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Aug 2, 2024, 1:13:44 PM                     ---
 * ----------------------------------------------------------------
 */
package my.bookstore.core.jalo;

import de.hybris.platform.acceleratorcms.jalo.components.SimpleBannerComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.media.Media;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import my.bookstore.core.constants.BookstoreCoreConstants;

/**
 * Generated class for type {@link my.bookstore.core.jalo.WCMS WCMS}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedWCMS extends SimpleBannerComponent
{
	/** Qualifier of the <code>WCMS.media1</code> attribute **/
	public static final String MEDIA1 = "media1";
	/** Qualifier of the <code>WCMS.button</code> attribute **/
	public static final String BUTTON = "button";
	/** Qualifier of the <code>WCMS.text</code> attribute **/
	public static final String TEXT = "text";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleBannerComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(MEDIA1, AttributeMode.INITIAL);
		tmp.put(BUTTON, AttributeMode.INITIAL);
		tmp.put(TEXT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>WCMS.button</code> attribute.
	 * @return the button
	 */
	public String getButton(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BUTTON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>WCMS.button</code> attribute.
	 * @return the button
	 */
	public String getButton()
	{
		return getButton( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>WCMS.button</code> attribute. 
	 * @param value the button
	 */
	public void setButton(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BUTTON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>WCMS.button</code> attribute. 
	 * @param value the button
	 */
	public void setButton(final String value)
	{
		setButton( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>WCMS.media1</code> attribute.
	 * @return the media1
	 */
	public Media getMedia1(final SessionContext ctx)
	{
		return (Media)getProperty( ctx, MEDIA1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>WCMS.media1</code> attribute.
	 * @return the media1
	 */
	public Media getMedia1()
	{
		return getMedia1( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>WCMS.media1</code> attribute. 
	 * @param value the media1
	 */
	public void setMedia1(final SessionContext ctx, final Media value)
	{
		setProperty(ctx, MEDIA1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>WCMS.media1</code> attribute. 
	 * @param value the media1
	 */
	public void setMedia1(final Media value)
	{
		setMedia1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>WCMS.text</code> attribute.
	 * @return the text
	 */
	public String getText(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TEXT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>WCMS.text</code> attribute.
	 * @return the text
	 */
	public String getText()
	{
		return getText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>WCMS.text</code> attribute. 
	 * @param value the text
	 */
	public void setText(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>WCMS.text</code> attribute. 
	 * @param value the text
	 */
	public void setText(final String value)
	{
		setText( getSession().getSessionContext(), value );
	}
	
}
