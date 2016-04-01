import spock.lang.Specification
import spock.lang.Unroll

class MakeEngrishSpec extends Specification {

    @Unroll
    def "#amount should write out #result"() {
        expect:
        result == MakeEngrish.transrate(amount)

        where:
        amount | result
        1      | 'One Dollar and 00/100'
        2      | 'Two Dollars and 00/100'
        10     | 'Ten Dollars and 00/100'
        15     | 'Fifteen Dollars and 00/100'
        20     | 'Twenty Dollars and 00/100'
        25     | 'Twenty-five Dollars and 00/100'
        100    | 'One Hundred Dollars and 00/100'

    }

}