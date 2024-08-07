/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package my.bookstore.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import my.bookstore.core.constants.BookstoreCoreConstants;
import my.bookstore.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class BookstoreCoreManager extends GeneratedBookstoreCoreManager
{
	public static final BookstoreCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (BookstoreCoreManager) em.getExtension(BookstoreCoreConstants.EXTENSIONNAME);
	}
}
