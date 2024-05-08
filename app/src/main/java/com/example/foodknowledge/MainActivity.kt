package com.example.foodknowledge

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.foodknowledge.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var fruitArraylist: ArrayList<Fruits>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        with(binding) {
            var fruitImageArray = arrayOf(
                R.drawable.kiwi,
                R.drawable.mango,
                R.drawable.orange,
                R.drawable.banana,
                R.drawable.litchi,
                R.drawable.kiwi,
                R.drawable.mango,
                R.drawable.orange,
                R.drawable.banana,
                R.drawable.litchi

            )
            var fruitnamearraylist = arrayOf(
                "kiwi",
                "mango",
                "orange",
                "banana",
                "litchi",
                "kiwi",
                "mango",
                "orange",
                "banana",
                "litchi"
            )
            var content = arrayOf(
//                "Kiwifruit (often shortened to kiwi outside New Zealand and Australia) or Chinese gooseberry is the edible berry of several species of woody vines in the genus Actinidia.[1][2] The most common cultivar group of kiwifruit (Actinidia deliciosa 'Hayward')[3] is oval, about the size of a large hen's egg: 5–8 centimetres (2–3 inches) in length and 4.5–5.5 cm (1+3⁄4–2+1⁄4 in) in diameter. It has a thin, fuzzy, fibrous, tart but edible light brown skin and light green or golden flesh with rows of tiny, black, edible seeds. The fruit has a soft texture with a sweet and unique flavour.\n" +
//                        "\n" +
//                        "Kiwifruit is native to central and eastern China.[1] The first recorded description of the kiwifruit dates to the 12th century during the Song dynasty.[4] In the early 20th century, cultivation of kiwifruit spread from China to New Zealand, where the first commercial plantings occurred.[1] The fruit became popular with British and American servicemen stationed in New Zealand during World War II, and later became commonly exported, first to Great Britain and then to California in the 1960s.[1][5]",
//                "A mango is an edible stone fruit produced by the tropical tree Mangifera indica. It originated from the region between northwestern Myanmar, Bangladesh, and northeastern India.[1][2] M. indica has been cultivated in South and Southeast Asia since ancient times resulting in two types of modern mango cultivars: the \"Indian type\" and the \"Southeast Asian type\".[1][2] Other species in the genus Mangifera also produce edible fruits that are also called \"mangoes\", the majority of which are found in the Malesian ecoregion.[3]\n" +
//                        "\n" +
//                        "Worldwide, there are several hundred cultivars of mango. Depending on the cultivar, mango fruit varies in size, shape, sweetness, skin color, and flesh color, which may be pale yellow, gold, green, or orange.[4] Mango is the national fruit of India, Pakistan and the Philippines,[5][6] while the mango tree is the national tree of Bangladesh.[7]\n" +
//                        "\n",
//                "An orange, also called sweet orange to distinguish it from the bitter orange (Citrus × aurantium), is the fruit of a tree in the family Rutaceae. Botanically, this is the hybrid Citrus × sinensis, between the pomelo (Citrus maxima) and the mandarin orange (Citrus reticulata). The chloroplast genome, and therefore the maternal line, is that of pomelo. The sweet orange has had its full genome sequenced.\n" +
//                        "\n" +
//                        "The orange originated in a region encompassing Southern China, Northeast India, and Myanmar; the earliest mention of the sweet orange was in Chinese literature in 314 BC. Orange trees are widely grown for their sweet fruit. The fruit of the orange tree can be eaten fresh, or processed for its juice or fragrant peel. In 2022, 76 million tonnes of oranges were grown worldwide, with Brazil producing 22% of the total, followed by India and China.\n" +
//                        "\n" +
//                        "Oranges have featured in human culture since ancient times. They first appear in Western art in the Arnolfini Portrait by Jan van Eyck, but they had been depicted in Chinese art centuries earlier, as in Zhao Lingrang's Song dynasty fan painting Yellow Oranges and Green Tangerines. By the 17th century, an orangery had become an item of prestige in Europe, as seen at the Versailles Orangerie. More recently, artists such as Vincent van Gogh, John Sloan, and Henri Matisse included oranges in their paintings",
//                "A banana is an elongated, edible fruit – botanically a berry[1] – produced by several kinds of large herbaceous flowering plants in the genus Musa. In some countries, cooking bananas are called plantains, distinguishing them from dessert bananas. The fruit is variable in size, color, and firmness, but is usually elongated and curved, with soft flesh rich in starch covered with a rind, which may have a variety of colors when ripe. The fruits grow upward in clusters near the top of the plant. Almost all modern edible seedless (parthenocarp) bananas come from two wild species – Musa acuminata and Musa balbisiana. Most cultivated bananas are M. acuminata, M. balbisiana, or hybrids of the two.\n" +
//                        "\n" +
//                        "Musa species are native to tropical Indomalaya and Australia; they were probably domesticated in New Guinea. They are grown in 135 countries, primarily for their fruit, and to a lesser extent to make banana paper and textiles, while some are grown as ornamental plants. The world's largest producers of bananas in 2022 were India and China, which together accounted for approximately 26% of total production. Bananas are eaten raw or cooked in recipes varying from curries to banana chips, fritters, fruit preserves, or simply baked or steamed.",
//                "Lychee[3] (US: /ˈliːtʃiː/ LEE-chee, UK: /ˈlaɪtʃiː/ LIE-chee; Litchi chinensis; Chinese: 荔枝; pinyin: lìzhī; Jyutping: lai6 zi1; Pe̍h-ōe-jī: nāi-chi) is a monotypic taxon and the sole member in the genus Litchi in the soapberry family, Sapindaceae.\n" +
//                        "\n" +
//                        "It is a tropical tree native to South China, Malaysia, and northern Vietnam.[4][5] The tree has been introduced throughout Southeast Asia and South Asia.[5] Cultivation in China is documented from the 11th century.[4] China is the main producer of lychees, followed by Vietnam, India, other countries in Southeast Asia, other countries in the South Asia, Madagascar, and South Africa. A tall evergreen tree, it bears small fleshy sweet fruits. The outside of the fruit is a pink-red, rough-textured soft shell.\n" +
//                        "\n" +
//                        "Lychee seeds contain methylene cyclopropyl glycine which has caused hypoglycemia associated with outbreaks of encephalopathy in undernourished Indian and Vietnamese children who consumed lychee fruit.[6][7]",
//                "Kiwifruit (often shortened to kiwi outside New Zealand and Australia) or Chinese gooseberry is the edible berry of several species of woody vines in the genus Actinidia.[1][2] The most common cultivar group of kiwifruit (Actinidia deliciosa 'Hayward')[3] is oval, about the size of a large hen's egg: 5–8 centimetres (2–3 inches) in length and 4.5–5.5 cm (1+3⁄4–2+1⁄4 in) in diameter. It has a thin, fuzzy, fibrous, tart but edible light brown skin and light green or golden flesh with rows of tiny, black, edible seeds. The fruit has a soft texture with a sweet and unique flavour.\n" +
//                        "\n" +
//                        "Kiwifruit is native to central and eastern China.[1] The first recorded description of the kiwifruit dates to the 12th century during the Song dynasty.[4] In the early 20th century, cultivation of kiwifruit spread from China to New Zealand, where the first commercial plantings occurred.[1] The fruit became popular with British and American servicemen stationed in New Zealand during World War II, and later became commonly exported, first to Great Britain and then to California in the 1960s.[1][5]",
//                "A mango is an edible stone fruit produced by the tropical tree Mangifera indica. It originated from the region between northwestern Myanmar, Bangladesh, and northeastern India.[1][2] M. indica has been cultivated in South and Southeast Asia since ancient times resulting in two types of modern mango cultivars: the \"Indian type\" and the \"Southeast Asian type\".[1][2] Other species in the genus Mangifera also produce edible fruits that are also called \"mangoes\", the majority of which are found in the Malesian ecoregion.[3]\n" +
//                        "\n" +
//                        "Worldwide, there are several hundred cultivars of mango. Depending on the cultivar, mango fruit varies in size, shape, sweetness, skin color, and flesh color, which may be pale yellow, gold, green, or orange.[4] Mango is the national fruit of India, Pakistan and the Philippines,[5][6] while the mango tree is the national tree of Bangladesh.[7]\n" +
//                        "\n",
//                "An orange, also called sweet orange to distinguish it from the bitter orange (Citrus × aurantium), is the fruit of a tree in the family Rutaceae. Botanically, this is the hybrid Citrus × sinensis, between the pomelo (Citrus maxima) and the mandarin orange (Citrus reticulata). The chloroplast genome, and therefore the maternal line, is that of pomelo. The sweet orange has had its full genome sequenced.\n" +
//                        "\n" +
//                        "The orange originated in a region encompassing Southern China, Northeast India, and Myanmar; the earliest mention of the sweet orange was in Chinese literature in 314 BC. Orange trees are widely grown for their sweet fruit. The fruit of the orange tree can be eaten fresh, or processed for its juice or fragrant peel. In 2022, 76 million tonnes of oranges were grown worldwide, with Brazil producing 22% of the total, followed by India and China.\n" +
//                        "\n" +
//                        "Oranges have featured in human culture since ancient times. They first appear in Western art in the Arnolfini Portrait by Jan van Eyck, but they had been depicted in Chinese art centuries earlier, as in Zhao Lingrang's Song dynasty fan painting Yellow Oranges and Green Tangerines. By the 17th century, an orangery had become an item of prestige in Europe, as seen at the Versailles Orangerie. More recently, artists such as Vincent van Gogh, John Sloan, and Henri Matisse included oranges in their paintings",
//                "A banana is an elongated, edible fruit – botanically a berry[1] – produced by several kinds of large herbaceous flowering plants in the genus Musa. In some countries, cooking bananas are called plantains, distinguishing them from dessert bananas. The fruit is variable in size, color, and firmness, but is usually elongated and curved, with soft flesh rich in starch covered with a rind, which may have a variety of colors when ripe. The fruits grow upward in clusters near the top of the plant. Almost all modern edible seedless (parthenocarp) bananas come from two wild species – Musa acuminata and Musa balbisiana. Most cultivated bananas are M. acuminata, M. balbisiana, or hybrids of the two.\n" +
//                        "\n" +
//                        "Musa species are native to tropical Indomalaya and Australia; they were probably domesticated in New Guinea. They are grown in 135 countries, primarily for their fruit, and to a lesser extent to make banana paper and textiles, while some are grown as ornamental plants. The world's largest producers of bananas in 2022 were India and China, which together accounted for approximately 26% of total production. Bananas are eaten raw or cooked in recipes varying from curries to banana chips, fritters, fruit preserves, or simply baked or steamed.",
//                "Lychee[3] (US: /ˈliːtʃiː/ LEE-chee, UK: /ˈlaɪtʃiː/ LIE-chee; Litchi chinensis; Chinese: 荔枝; pinyin: lìzhī; Jyutping: lai6 zi1; Pe̍h-ōe-jī: nāi-chi) is a monotypic taxon and the sole member in the genus Litchi in the soapberry family, Sapindaceae.\n" +
//                        "\n" +
//                        "It is a tropical tree native to South China, Malaysia, and northern Vietnam.[4][5] The tree has been introduced throughout Southeast Asia and South Asia.[5] Cultivation in China is documented from the 11th century.[4] China is the main producer of lychees, followed by Vietnam, India, other countries in Southeast Asia, other countries in the South Asia, Madagascar, and South Africa. A tall evergreen tree, it bears small fleshy sweet fruits. The outside of the fruit is a pink-red, rough-textured soft shell.\n" +
//                        "\n" +
//
//                        "Lychee seeds contain methylene cyclopropyl glycine which has caused hypoglycemia associated with outbreaks of encephalopathy in undernourished Indian and Vietnamese children who consumed lychee fruit.[6][7]",
//
                getString(R.string.fruit_content),
                getString(R.string.fruit_content),
                getString(R.string.fruit_content),
                getString(R.string.fruit_content),
                getString(R.string.fruit_content),
                getString(R.string.fruit_content),
                getString(R.string.fruit_content),
                getString(R.string.fruit_content), getString(R.string.fruit_content),
                getString(R.string.fruit_content)



            )
           MyRecycler.layoutManager= LinearLayoutManager(this@MainActivity)
            fruitArraylist = arrayListOf<Fruits>()
            for (index in fruitArraylist.indices) {
                val fruit=Fruits(fruitImageArray[index],fruitnamearraylist[index],content[index])
                fruitArraylist.add(fruit)
            }
            var myAdapter=MyAdapter(fruitArraylist,this@MainActivity)
            MyRecycler.adapter=myAdapter
            myAdapter.setItemClickListener(object :MyAdapter.onItemClickListener{
                override fun onItemClick(position: Int) {
                    val intent=Intent(this@MainActivity,fruitDetail::class.java)
                    intent.putExtra("fruitName",fruitArraylist[position]. fruitName)
                    intent.putExtra("fruitId",fruitArraylist[position].FruitImage)
                    intent.putExtra("fruitContent",fruitArraylist[position].Content)
                    startActivity(intent)

                }

            })
        }


    }


}
