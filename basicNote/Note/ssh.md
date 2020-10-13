
### 如何在码云上部署SSH
        1、先查看自己电脑中的文件.ssh；如果次文件夹中含有id_rsa和id_rsa.pub，那么使用命令：rm -rf id_rsa和rm -rf id_rsa.pub对着两个进行强制删除。
        2、再删除了上述两个文件后，使用命令：git clone git@gitee.com:promsie423来创建一个属于你自己个人的id_rsa和id_rsa.pub。
        3、使用命令：ssh -T git@gitee.com 可以查看是否安装成功。
        4、再使用命令：cat id_rsa.pub查看公钥，并复制公钥。
        5、打开码云，在个人详情中打开设置，找到左边的SSH公钥，打开。并将上一步复制好的公钥粘贴进去。
        6、完成以上步骤即可完成了SSH的部署。
---
&nbsp;