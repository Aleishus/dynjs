package org.dynjs.runtime.builtins.math;

import org.dynjs.runtime.AbstractNativeFunction;
import org.dynjs.runtime.ExecutionContext;
import org.dynjs.runtime.GlobalObject;
import org.dynjs.runtime.Types;
import org.dynjs.runtime.builtins.Math;

public class Pow extends AbstractNativeFunction {

    public Pow(GlobalObject globalObject) {
        super(globalObject, "x");
    }

    @Override
    public Object call(ExecutionContext context, Object self, Object... args) {
        Double x = Types.toNumber(context, args[0]).doubleValue();
        Double y = Types.toNumber(context, args[1]).doubleValue();
        return Math.coerceLongIfPossible(java.lang.Math.pow(x, y));
    }

}
