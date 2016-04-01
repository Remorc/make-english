class MakeEngrish {

    def static numberStrings = [0: '', 1: 'One ', 2: 'Two ', 10: 'Ten ', 15: 'Fifteen ', 20: 'Twenty ']
    def static places = [100: 'Hundred ', 10: '', 1: '']

    static def transrate(int amount) {
        doShut(amount, 100) + "${amount > 1 ? 'Dollars' : 'Dollar'} and 00/100"
    }

    static def doShut(int amount, int place) {
        if (amount == 0) return ''

        int numberToPrint = amount / place
        if (numberToPrint > 0) {
            "${numberStrings[numberToPrint]}${places[place]}${doShut(amount % place as int, place / 100 as int)}"
        } else {
            "${doShut(amount % place as int, place / 100 as int)}"
        }
    }

}
