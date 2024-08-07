/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package my.bookstore.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import my.bookstore.fulfilmentprocess.constants.BookstoreFulfilmentProcessConstants;

public class BookstoreFulfilmentProcessManager extends GeneratedBookstoreFulfilmentProcessManager
{
	public static final BookstoreFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (BookstoreFulfilmentProcessManager) em.getExtension(BookstoreFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
