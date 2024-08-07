/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Aug 2, 2024, 1:13:44 PM                     ---
 * ----------------------------------------------------------------
 */
package my.bookstore.core.jalo;

import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import my.bookstore.core.constants.BookstoreCoreConstants;

/**
 * Generated class for type {@link de.hybris.platform.cronjob.jalo.CronJob MyCronJob}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedMyCronJob extends CronJob
{
	/** Qualifier of the <code>MyCronJob.minCartAge</code> attribute **/
	public static final String MINCARTAGE = "minCartAge";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(MINCARTAGE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyCronJob.minCartAge</code> attribute.
	 * @return the minCartAge - Carts modified after specified number of seconds will be picked up
	 */
	public Integer getMinCartAge(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MINCARTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyCronJob.minCartAge</code> attribute.
	 * @return the minCartAge - Carts modified after specified number of seconds will be picked up
	 */
	public Integer getMinCartAge()
	{
		return getMinCartAge( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyCronJob.minCartAge</code> attribute. 
	 * @return the minCartAge - Carts modified after specified number of seconds will be picked up
	 */
	public int getMinCartAgeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMinCartAge( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyCronJob.minCartAge</code> attribute. 
	 * @return the minCartAge - Carts modified after specified number of seconds will be picked up
	 */
	public int getMinCartAgeAsPrimitive()
	{
		return getMinCartAgeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyCronJob.minCartAge</code> attribute. 
	 * @param value the minCartAge - Carts modified after specified number of seconds will be picked up
	 */
	public void setMinCartAge(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MINCARTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyCronJob.minCartAge</code> attribute. 
	 * @param value the minCartAge - Carts modified after specified number of seconds will be picked up
	 */
	public void setMinCartAge(final Integer value)
	{
		setMinCartAge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyCronJob.minCartAge</code> attribute. 
	 * @param value the minCartAge - Carts modified after specified number of seconds will be picked up
	 */
	public void setMinCartAge(final SessionContext ctx, final int value)
	{
		setMinCartAge( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyCronJob.minCartAge</code> attribute. 
	 * @param value the minCartAge - Carts modified after specified number of seconds will be picked up
	 */
	public void setMinCartAge(final int value)
	{
		setMinCartAge( getSession().getSessionContext(), value );
	}
	
}
