/*xml
<module name="Checker">
  <module name="TreeWalker">
    <module name="AbstractClassName">
      <property name="ignoreName" value="true"/>
    </module>
  </module>
</module>


*/

package com.puppycrawl.tools.checkstyle.checks.naming.abstractclassname;

class Example3 {
  // xdoc section -- start
  abstract class AbstractFirst {}
  abstract class Second {}
  class AbstractThird {} // violation 'must be declared as 'abstract''
  class Fourth {}
  abstract class GeneratorFifth {}
  class GeneratorSixth {}
  // xdoc section -- end
}
