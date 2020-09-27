/***** Lobxxx Translate Finished ******/
/*
 * Copyright (c) 1997, 2007, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */


/* Generated By:JJTree: Do not edit this line. JDMTrapCommunity.java */

package com.sun.jmx.snmp.IPAcl;

class JDMTrapCommunity extends SimpleNode {
  protected String community= "";
  JDMTrapCommunity(int id) {
    super(id);
  }

  JDMTrapCommunity(Parser p, int id) {
    super(p, id);
  }

  public static Node jjtCreate(int id) {
      return new JDMTrapCommunity(id);
  }

  public static Node jjtCreate(Parser p, int id) {
      return new JDMTrapCommunity(p, id);
  }

  public String getCommunity() {
        return community;
  }
}
