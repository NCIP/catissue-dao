/*L
 * Copyright Washington University in St. Louis, SemanticBits, Persistent Systems, Krishagni.
 *
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/catissue-dao/LICENSE.txt for details.
 */

/*
 * TODO
 */
package edu.wustl.dao.formatmessage;

import edu.wustl.dao.JDBCDAO;

/**
 * @author kalpana_thakur
 *
 */
public interface IDBExceptionFormatter
{
	/**
	 * @param objExcp :Exception.
	 * @param jdbcDAO : jdbcDAO.
 	 * @return It will return the formatted messages.
	 */
	String getFormatedMessage(Exception objExcp,JDBCDAO jdbcDAO);
}
