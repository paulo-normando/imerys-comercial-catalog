package br.com.imerys.imeryscomercialcatalog.domain

data class Solutions (private var _id:String,
                      private var _markets:String,
                      private var _category:String,
                      private var _image:String,
                      private var _name:String,
                      private var _region:String,
                      private var _link:String,
                      private var _description:String,){
    var id: String = _id
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var markets: String = _markets
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var category: String = _category
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var image: String = _image
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var name: String = _name
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var region: String = _region
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var link: String = _link
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var description: String = _description
        get() {
            return field
        }
        set(value) {
            field = value
        }
}