package eric.yu.demo.decorator;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/24/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

public abstract class Decorator implements Component
{
    protected Component component;

    public Decorator(Component component)
    {
        this.component = component;
    }
    @Override
    public abstract void doSomething();
}
