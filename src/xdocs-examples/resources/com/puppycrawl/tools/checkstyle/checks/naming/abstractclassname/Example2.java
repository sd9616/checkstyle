/*xml
<module name="Checker">
  <module name="TreeWalker">
    <module name="AbstractClassName">
      <property name="ignoreModifier" value="true"/>
    </module>
  </module>
</module>


*/

package com.puppycrawl.tools.checkstyle.checks.naming.abstractclassname;

class Example2 {
  // xdoc section -- start
  abstract class AbstractFirst {}
  abstract class Second {} // violation 'must match pattern'
  class AbstractThird {}
  class Fourth {}
  abstract class GeneratorFifth {}
  // violation above 'must match pattern'
  class GeneratorSixth {}
  // xdoc section -- end
}
