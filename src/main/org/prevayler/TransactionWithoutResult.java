// Prevayler, The Free-Software Prevalence Layer
// Copyright 2001-2006 by Klaus Wuestefeld
//
// This library is distributed in the hope that it will be useful, but WITHOUT
// ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
// FITNESS FOR A PARTICULAR PURPOSE.
//
// Prevayler is a trademark of Klaus Wuestefeld.
// See the LICENSE file for license details.

package org.prevayler;

/**
 * An atomic Transaction to be executed on a Prevalent System. Any operation
 * which changes the observable state of a prevalent system must be encapsulated
 * as a Transaction. <br>
 * <br>
 * IMPORTANT: Transactions CANNOT reference business objects directly. Instead,
 * they must search the business objects they need given the Prevalent System.
 * See org.prevayler.demos for usage examples. <br>
 * <br>
 * Business objects referenced in a transaction will be mere copies of the
 * original business objects when that transaction is recovered from the
 * serialized journal file. This will make the transactions work when they are
 * executed for the first time but have no effect during shutdown recovery. This
 * is known as the prevalence baptism problem because everyone comes across it,
 * despite of this warning.
 */
public interface TransactionWithoutResult<T> extends Transaction<T, Void, RuntimeException> {
}
